// 创建实体节点
CREATE (e1:Entity {id: 1, name: '杨过', attributes: '男主角'});
CREATE (e2:Entity {id: 2, name: '小龙女', attributes: '女主角'});
CREATE (e3:Entity {id: 3, name: '郭靖', attributes: '男配角'});
CREATE (e4:Entity {id: 4, name: '黄蓉', attributes: '女配角'});

// 创建关系
CREATE (e1)-[:RELATIONSHIP {id: 1, type: '爱人'}]->(e2);
CREATE (e1)-[:RELATIONSHIP {id: 2, type: '师徒'}]->(e2);
CREATE (e1)-[:RELATIONSHIP {id: 3, type: '朋友'}]->(e3);
CREATE (e2)-[:RELATIONSHIP {id: 4, type: '朋友'}]->(e4);