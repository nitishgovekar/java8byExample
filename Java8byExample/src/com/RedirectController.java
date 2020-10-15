@Controller
@RequestMapping("/")
public class RedirectController {
    
    @GetMapping("/redirectWithRedirectPrefix")
    public ModelAndView redirectWithUsingRedirectPrefix(ModelMap model) {
        model.addAttribute("attribute", "redirectWithRedirectPrefix");
        return new ModelAndView("redirect:/redirectedUrl", model);
    }
}


/** 
A better option is using the prefix redirect: – the redirect view name is injected into the controller like any other logical view name. The controller is not even aware that redirection is happening













When a view name is returned with the prefix redirect: – the UrlBasedViewResolver (and all its subclasses) will recognize this as a special indication that a redirect needs to happen. The rest of the view name will be used as the redirect URL.

**/
