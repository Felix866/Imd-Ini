package converters;


import domain.Teoria;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class TeoriaToStringConverter implements Converter<Teoria, String>{

    @Override
    public String convert(Teoria teoria) {

        String result;
        if(teoria == null){
            result = null;
        }else{
            result = String.valueOf(teoria.getId());
        }
        return result;
    }

}
