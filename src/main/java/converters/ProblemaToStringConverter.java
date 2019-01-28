package converters;


import domain.Problema;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class ProblemaToStringConverter implements Converter<Problema, String>{

    @Override
    public String convert(Problema problema) {

        String result;
        if(problema == null){
            result = null;
        }else{
            result = String.valueOf(problema.getId());
        }
        return result;
    }

}
