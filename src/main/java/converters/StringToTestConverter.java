package converters;


import domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import repositories.TestRepository;

import javax.transaction.Transactional;

@Component
@Transactional
public class StringToTestConverter implements Converter<String, Test>{

    @Autowired
    TestRepository testRepository;

    @Override
    public Test convert(String text) {
        Test result;
        int id;

        try{
            if(StringUtils.isEmpty(text)){
                result = null;
            }else{
                id = Integer.valueOf(text);
                result = testRepository.findOne(id);
            }
        }catch(Throwable oops){
            throw new IllegalArgumentException(oops);
        }
        return result;
    }

}