package converters;


import domain.Problema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import repositories.ProblemaRepository;

import javax.transaction.Transactional;

@Component
@Transactional
public class StringToProblemaConverter implements Converter<String, Problema>{

    @Autowired ProblemaRepository problemaRepository;

    @Override
    public Problema convert(String text) {
        Problema result;
        int id;

        try{
            if(StringUtils.isEmpty(text)){
                result = null;
            }else{
                id = Integer.valueOf(text);
                result = problemaRepository.findOne(id);
            }
        }catch(Throwable oops){
            throw new IllegalArgumentException(oops);
        }
        return result;
    }

}
