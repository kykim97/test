package test.domain;

import test.domain.Tested;
import test.TestApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Test_table")
@Data

public class Test  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String test;

    @PostPersist
    public void onPostPersist(){


        Tested tested = new Tested(this);
        tested.publishAfterCommit();

    }

    public static TestRepository repository(){
        TestRepository testRepository = TestApplication.applicationContext.getBean(TestRepository.class);
        return testRepository;
    }






}
