part of swagger.api;

class InlineResponse200 {
  
  List<OneOfinlineResponse200ParrotsItems> parrots = [];

  InlineResponse200();

  @override
  String toString() {
    return 'InlineResponse200[parrots=$parrots, ]';
  }

  InlineResponse200.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    parrots = Object.listFromJson(json['parrots']);
  }

  Map<String, dynamic> toJson() {
    return {
      'parrots': parrots
     };
  }

  static List<InlineResponse200> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse200>() : json.map((value) => new InlineResponse200.fromJson(value)).toList();
  }

  static Map<String, InlineResponse200> mapFromJson(Map<String, Map<String, dynamic>> json) {
    var map = new Map<String, InlineResponse200>();
    if (json != null && json.length > 0) {
      json.forEach((String key, Map<String, dynamic> value) => map[key] = new InlineResponse200.fromJson(value));
    }
    return map;
  }
}
