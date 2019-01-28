package converters;


import domain.Diofantica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import repositories.DiofanticaRepository;

import javax.transaction.Transactional;

@Component
@Transactional
public class StringToDiofanticaConverter implements Converter<String, Diofantica>{

    @Autowired
    DiofanticaRepository diofanticaRepository;

    @Override
    public Diofantica convert(String text) {
        Diofantica result;
        int id;

        try{
            if(StringUtils.isEmpty(text)){
                result = null;
            }else{
                id = Integer.valueOf(text);
                result = diofanticaRepository.findOne(id);
            }
        }catch(Throwable oops){
            throw new IllegalArgumentException(oops);
        }
        return result;
    }

}