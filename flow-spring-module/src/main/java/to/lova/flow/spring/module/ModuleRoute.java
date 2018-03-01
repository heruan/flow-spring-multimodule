package to.lova.flow.spring.module;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("module")
public class ModuleRoute extends Div {

    public ModuleRoute() {
        this.add(new H1("Module"));
    }

}
