import com.zzc.dao.AdminDao;
import com.zzc.dao.UserDao;
import com.zzc.dao.impl.EmpDaoImpl;
import com.zzc.entity.Emp;
import com.zzc.entity.User;
import com.zzc.util.MybatisUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther James_Gosling
 * @Date 2020/12/16
 */
public class MyTest {
    @Test
    public void test01(){
        EmpDaoImpl empDao = new EmpDaoImpl();
        Emp build = Emp.builder().name("zs3").job("java").sal(123.12).deptno(2).build();
        int i = empDao.insertReturnId(build);
        System.out.println(build.getId());
    }
    @Test
    public void test02(){
        UserDao mapper = MybatisUtil.getSqlSession().getMapper(UserDao.class);
        List<User> all = mapper.findAll();
        System.out.println(all);
    }
    @Test
    public void test03(){
        AdminDao mapper = MybatisUtil.getSqlSession().getMapper(AdminDao.class);
        System.out.println(mapper.findAll());
    }
    @Test
    public void test04(){
        String a="sadasda";
        char[] chars = a.toCharArray();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for (char aChar : chars) {
            Integer integer = map.get(aChar);
            if(map.containsKey(aChar)){
                map.put(aChar,integer+1);
            }else {
                map.put(aChar,1);
            }
        }
        System.out.println(map);
    }
}
