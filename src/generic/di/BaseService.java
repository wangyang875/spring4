package generic.di;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
    @Autowired
    protected BaseRepository<T> baseRepository;
    public void add(){
        System.out.println("add...");
        System.out.println(baseRepository);
    }
}
