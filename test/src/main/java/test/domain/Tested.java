package test.domain;

import test.domain.*;
import test.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Tested extends AbstractEvent {

    private Long id;
    private String test;

    public Tested(Test aggregate){
        super(aggregate);
    }
    public Tested(){
        super();
    }
}
