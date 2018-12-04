package filter;

import org.apache.ibatis.session.SqlSession;
import util.mybaties.MybatiesUtil;

import javax.servlet.*;
import java.io.IOException;

public class SqlsessionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //获取线程中的session
        SqlSession session = MybatiesUtil.getSession();

        //过滤器放行
        filterChain.doFilter(servletRequest,servletResponse);

        //业务代码执行之后进行commit操作
        try {
            session.commit();
        } catch (Exception e) {
            session.rollback();
        }finally {
            MybatiesUtil.closeSession();
        }

    }

    @Override
    public void destroy() {

    }
}
