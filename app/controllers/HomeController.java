package controllers;

import play.mvc.*;

import views.html.*;

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


	public Result index()
	{
		return ok(index.render());
	}

        public Result blank()
	{
		return ok(blank.render());
	}

	public Result buttons()
	{
		return ok(buttons.render());
	}
	
	public Result flot()
	{
		return ok(flot.render());
	}

	public Result forms()
	{
		return ok(forms.render());
	}

	public Result grid()
	{
		return ok(grid.render());
	}

	public Result icons()
	{
		return ok(icons.render());
	}

	public Result morris()
	{
		return ok(morris.render());
	}

	public Result notifications()
	{
		return ok(notifications.render());
	}
	public Result panelswells()
	{
		return ok(panelswells.render());
	}

	public Result tables()
	{
		return ok(tables.render());
	}
	public Result typography()
	{
		return ok(typography.render());
	}

}








































