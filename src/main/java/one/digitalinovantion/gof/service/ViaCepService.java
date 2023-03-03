package one.digitalinovantion.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import one.digitalinovantion.gof.model.Endereco;

/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 * @see <a href="https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br/">ViaCEP</a>
 * 
 * @author WANGOMES
 */

@FeignClient(name="viacep", url="https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value="/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep);

}