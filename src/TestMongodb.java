
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
            //ʵ����Mongo��������27017�˿�
            Mongo mongo = new Mongo("localhost", 27017);
                               //������Ϊyourdb�����ݿ⣬�������ݿⲻ���ڵĻ���mongodb���Զ�����
            DB db = mongo.getDB("test");
            // Get collection from MongoDB, database named "yourDB"
//��Mongodb�л����ΪyourColleection�����ݼ��ϣ���������ݼ��ϲ����ڣ�Mongodb��Ϊ���½���
            DBCollection collection = db.getCollection("yourCollection");
    // ʹ��BasicDBObject���󴴽�һ��mongodb��document,�����踳ֵ��
            
             
//��ѯ���м�¼
         //   long startTime=System.currentTimeMillis();
//            DBCursor cur = collection.find();
            long num = collection.count();
        //    long endTime=System.currentTimeMillis();
       //     System.out.println(endTime-startTime+"ms");
            System.out.println("�ܼ�¼"+num); 
          
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
          
          
            //���½�����document���浽collection��ȥ
//            collection.insert(document);
            // ����Ҫ��ѯ��document
            BasicDBObject searchQuery = new BasicDBObject();
//           / searchQuery.put("id", 1001);
            // ʹ��collection��find��������document
            
          
            DBCursor cursor = collection.find(searchQuery);
          //ִ�з���
            
            //ѭ��������
            long startTime=System.currentTimeMillis();
            while (cursor.hasNext()) {
            System.out.println(cursor.next());
            }
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime+"ms");
            System.out.println("Done"); 
            
            //ɾ������
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
