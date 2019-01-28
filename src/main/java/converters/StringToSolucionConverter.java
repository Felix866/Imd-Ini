package converters;


import domain.Solucion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import repositories.SolucionRepository;

import javax.transaction.Transactional;

@Component
@Transactional
public class StringToSolucionConverter implements Converter<String, Solucion>{

    @Autowired
    SolucionRepository solucionRepository;

    @Override
    public Solucion convert(String text) {
        Solucion result;
        int id;

        try{
            if(StringUtils.isEmpty(text)){
                result = null;
            }else{
                id = Integer.valueOf(text);
                result = solucionRepository.findOne(id);
            }
        }catch(Throwable oops){
            throw new IllegalArgumentException(oops);
        }
        return result;
    }

}