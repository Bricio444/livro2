package application.controllers;


import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/livro")
public class LivroController{
    @autowired
    private LivroRepository livrosRepo;
    @RequstMapping("/list")
public string list(Model model)
model addAtribute("livro2 ", livroRepo. findAll())
return "list. jsp";
    }
}
public class LivroController {
    


    
}
