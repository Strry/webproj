package util.mybaties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatiesUtil {

    //保证全局只有一个sqlsessionfactory
    private static SqlSessionFactory sf;

    //因为现在session现在要在过滤器获取，同时也要在servlet中调用，所以要对sqlsession进行线程绑定
    private static ThreadLocal threadLocal = new ThreadLocal();

    //静态代码块初始化
    static{
        try {
            InputStream is = Resources.getResourceAsStream("mybaties-cfg.xml");
            sf = new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //生成sqlsession的方法
    public static SqlSession getSession(){
        SqlSession session = (SqlSession)threadLocal.get();
        if(session==null){
            session = sf.openSession();
            threadLocal.set(session);
        }
        return (SqlSession)threadLocal.get();
    }

    //关闭session方法
    public static void closeSession(){
        SqlSession session = (SqlSession)threadLocal.get();
        if(session!=null){
            session.close();
        }
        //清空threadlocal
        threadLocal.set(null);
    }
}
