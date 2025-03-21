package com.example.projeto.controle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class jsonTranslator {
    @GetMapping("/ptTranslateJson")
    public ResponseEntity<String> jsonTranslate() {
        try {
            // Caminho para o arquivo JSON na pasta resources
            String filePath = "src/main/resources/ptTranslateTable.json";

            // Ler o conteúdo do arquivo JSON
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));

            // Retornar o JSON como resposta
            return ResponseEntity.ok(jsonContent);
        } catch (IOException e) {
            // Caso o arquivo não seja encontrado ou haja algum erro
            return ResponseEntity.status(500).body("Erro ao carregar o arquivo JSON");
        }
    }
}
