package converters;


import domain.Diofantica;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class DiofanticaToStringConverter implements Converter<Diofantica, String>{

    @Override
    public String convert(Diofantica diofantica) {

        String result;
        if(diofantica == null){
            result = null;
        }else{
            result = String.valueOf(diofantica.getId());
        }
        return result;
    }

}
