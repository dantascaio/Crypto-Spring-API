package br.com.fiap.cryptobb;

import com.fasterxml.jackson.databind.util.ClassUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("cryptos")
public class CryptoController {

    private List<CryptoDTO> listCryptos;

    public CryptoController(){
         listCryptos = Arrays.asList(
                new CryptoDTO(1, "BitCoin", "BTC", BigDecimal.valueOf(150_000)),
                new CryptoDTO(2, "DogeCoin", "Doge", BigDecimal.valueOf(100_000)));
    }

    @GetMapping
    public List<CryptoDTO> listCryptos(){
        return listCryptos;
    }

}