package com.example.registration.controllers;

/*@Controller
public class AuthController {
    @Autowired
    private CustomUserDetailsService userService;

    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/signup2", method = RequestMethod.GET)
    public ModelAndView signup2(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User;
        modelAndView.addObject("user", user);
        modelAndView.setViewName("signup2");
        return modelAndView;
    }
    @RequestMapping(value = "/signup3", method = RequestMethod.POST)
    public ModelAndView createNewUser(User user, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByEmail(user.getEmail());
        if(userExists != null){
            bindingResult.rejectValue("email", "error.user", "There is already a user registrered with the username provided");

        }
        if(bindingResult.hasErrors()){
            modelAndView.setViewName("signup");
        }else{
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
    @RequestMapping(value = "/da", method = RequestMethod.GET)
    public ModelAndView signup(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User;
        modelAndView.addObject("user", user);
        modelAndView.setViewName("signup");
        return modelAndView;
    }


}

 */
