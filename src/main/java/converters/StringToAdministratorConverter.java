package converters;


import domain.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import repositories.AdministratorRepository;

import javax.transaction.Transactional;

@Component
@Transactional
public class StringToAdministratorConverter implements Converter<String, Administrator>{

    @Autowired
    AdministratorRepository administratorRepository;

    @Override
    public Administrator convert(String text) {
        Administrator result;
        int id;

        try{
            if(StringUtils.isEmpty(text)){
                result = null;
            }else{
                id = Integer.valueOf(text);
                result = administratorRepository.findOne(id);
            }
        }catch(Throwable oops){
            throw new IllegalArgumentException(oops);
        }
        return result;
    }

}