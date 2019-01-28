package converters;


import domain.Teoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import repositories.TeoriaRepository;

import javax.transaction.Transactional;

@Component
@Transactional
public class StringToTeoriaConverter implements Converter<String, Teoria>{

    @Autowired
    TeoriaRepository teoriaRepository;

    @Override
    public Teoria convert(String text) {
        Teoria result;
        int id;

        try{
            if(StringUtils.isEmpty(text)){
                result = null;
            }else{
                id = Integer.valueOf(text);
                result = teoriaRepository.findOne(id);
            }
        }catch(Throwable oops){
            throw new IllegalArgumentException(oops);
        }
        return result;
    }

}