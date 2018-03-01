package to.lova.flow.spring.app;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

import to.lova.flow.spring.module.ModuleService;

@Route("")
public class Home extends Div {

    @Autowired
    public Home(ModuleService serviceFromModule) {
        this.add(new H1("Home"));
        this.add(new Text(serviceFromModule.name()));
    }

}
