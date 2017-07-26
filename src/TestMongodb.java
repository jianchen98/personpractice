
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoException;


public class TestMongodb {
	public static void main(String[] args) {
		try {
            //实例化Mongo对象，连接27017端口
            Mongo mongo = new Mongo("localhost", 27017);
                               //连接名为yourdb的数据库，假如数据库不存在的话，mongodb会自动建立
            DB db = mongo.getDB("test");
            // Get collection from MongoDB, database named "yourDB"
//从Mongodb中获得名为yourColleection的数据集合，如果该数据集合不存在，Mongodb会为其新建立
            DBCollection collection = db.getCollection("yourCollection");
    // 使用BasicDBObject对象创建一个mongodb的document,并给予赋值。
            
             
//查询所有记录
         //   long startTime=System.currentTimeMillis();
//            DBCursor cur = collection.find();
            long num = collection.count();
        //    long endTime=System.currentTimeMillis();
       //     System.out.println(endTime-startTime+"ms");
            System.out.println("总记录"+num); 
          
//            while (cur.hasNext()) {
//	            System.out.println(cur.next());
//           }
           
           List list = new ArrayList();
            for (int i =0;i<1000000;i++){
            	 BasicDBObject document = new BasicDBObject();
            	  document.put("id", 1001+i);
                  document.put("msg", "hello world"+i);
                  list.add(document);
            }
//            collection.insert(list);	 
          
          
            //将新建立的document保存到collection中去
//            collection.insert(document);
            // 创建要查询的document
            BasicDBObject searchQuery = new BasicDBObject();
//           / searchQuery.put("id", 1001);
            // 使用collection的find方法查找document
            
          
            DBCursor cursor = collection.find(searchQuery);
          //执行方法
            
            //循环输出结果
            long startTime=System.currentTimeMillis();
            while (cursor.hasNext()) {
            System.out.println(cursor.next());
            }
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime+"ms");
            System.out.println("Done"); 
            
            //删除对象
          /*  BasicDBObject deldocument = new BasicDBObject();
            deldocument.put("id", 1001000);
            collection.remove(deldocument);*/
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }
	}
}	
