package to.lova.flow.spring.module;

import org.springframework.stereotype.Service;

@Service
public class ModuleService {

    public String name() {
        return this.getClass().getSimpleName();
    }

}
