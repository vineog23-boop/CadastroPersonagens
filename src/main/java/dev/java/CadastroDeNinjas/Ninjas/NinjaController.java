package dev.java.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas (){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar Ninja      (CREATE)
    @PostMapping ("/criar")
    public  String criarNinja(){
        return "Ninja criado com sucesso";
    }

    // MOSTRAR TODOS OS NINJAS    (READ)
@GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.listarTodosOsNinjas();
    }

    // MOSTRAR  O NINJA POR ID     (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }
    // ALTERAR DADOS DO NINJA     (UPDATE)
@PutMapping ("/alterarID")
    public String alterarNinjaPorId(){
        return "Altererar Ninja por Id";
    }
    // DELETAR NINJA            (DELETE)
    @DeleteMapping ("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por Id";
    }

}
