package fit.hutech.spring;
import fit.hutech.spring.entities.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks() {
        var books = new ArrayList<Book>();
        books.add(new Book("Ánh Nguyễn", "Công nghệ thông tin",1L , 29.99,"Lập trình Web Spring Framework"));
                books.add(new Book("Huy Cường","Công nghệ thông tin" , 2L, 45.63, "Lập trình ứng dụng Java"));
        books.add(new Book("Xuân Nhân","Công nghệ thông tin" ,3L , 12., "Lập trình Web Spring Boot"));
                books.add(new Book("Ánh Nguyễn","Công nghệ thông tin" ,4L , .12, "Lập trình Web Spring MVC"));
        return books;
    }
}