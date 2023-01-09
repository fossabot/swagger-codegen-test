# swagger-codegen-test

### files:

* test-framework.py
* generate-report.py
* test-framework-data.json
* test-framework-data-....json

`test-framework.py` invokes GH workflow and analyze result into a result(s).csv

`test-framework-data.json` defines tests to run

`generate-report.py` generates HTML report, either of all or 2 specific versions

related codegen test workflows are invoked in `swagger-codegen` repo (they must be defined in master branch)


### spec files

The following repo and branch hold the specifications used by test, referenced in data file.

Such specs MUST NEVER BE CHANGED, nor the mapping of spec "name" to URL in data file. This is to allow
consistent history and comparison

https://github.com/swagger-api/swagger-codegen-test/tree/specifications/immutable/specifications 


### run

run it manually via:

```
GH_USER=frantuma
GH_EXECUTOR=frantuma
GH_TOKEN=....
chmod +x test-framework.py
python3 ./test-framework.py 
```

or
```
GH_USER=frantuma
GH_EXECUTOR=frantuma
GH_TOKEN=....
python3 ./test-framework.py $GH_USER $GH_TOKEN CODEGEN_VERSION_V2 CODEGEN_VERSION_V3
```

e.g.

* `python3 ./test-framework.py`
* `python3 ./test-framework.py $GH_USER $GH_TOKEN 2.4.19 3.0.25`

or
```
GH_USER=frantuma
GH_EXECUTOR=frantuma
GH_TOKEN=....
python3 ./test-framework.py $GH_USER $GH_TOKEN CODEGEN_VERSION_V2 CODEGEN_VERSION_V3 True /path/to/data/file
```

e.g.

* `python3 ./test-framework.py`
* `python3 ./test-framework.py $GH_USER $GH_TOKEN 2.4.19 3.0.25 True /path/to/data/file`


To generate report run

```
chmod +x generate-report.py
python3 ./generate-report.py  
```

or
```
chmod +x generate-report.py
python3 ./generate-report.py latest latest 2.4.19 3.0.25  
```

where the parameters are in order:

v2 newest version to compare (e.g. `latest` for snapshot, or `2.4.19`)
v3 newest version to compare (e.g. `latest` for snapshot, or `3.0.25`)
v2 oldest version to compare (e.g. `latest` for snapshot, or `2.4.18`)
v3 oldest version to compare (e.g. `latest` for snapshot, or `3.0.24`)


### GH WORKFLOW

above scripts are runnable via GH workflows in .github/workflows 

codegen-test.yml: expects optional params for v2 and v3 version.

codegen-test-report.yml: expects optional params for v2 and v3 newest and oldest version.
relies on codegen-test.yml being run before

both workflows commit result into "out" directory
