package org.app;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {
//    @Autowired
//    OfficeHours officeHour;
    protected OfficeHours officeHours;




//    @Autowired
//    public Java(OfficeHours officeHours){
//        this.officeHours=officeHours;
//    }
    public void getTeachingHours(){
        System.out.println("Total teaching hours : "   +(20 + officeHours.getHours()));
    }

}
