package converters;


import domain.Solucion;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class SolucionToStringConverter implements Converter<Solucion, String>{

    @Override
    public String convert(Solucion solucion) {

        String result;
        if(solucion == null){
            result = null;
        }else{
            result = String.valueOf(solucion.getId());
        }
        return result;
    }

}
