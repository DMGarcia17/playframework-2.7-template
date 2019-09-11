package controllers;

import models.Currency;
import play.mvc.*;

import java.util.Optional;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        Currency c = Currency.finder.byId(1);
        Optional<Currency> query = Currency.finder.query().select("name").where().icontains("name", "US").findOneOrEmpty();


        return dashboard();
    }

    public Result dashboard() {
        return ok(views.html.index3.render());
    }

}
