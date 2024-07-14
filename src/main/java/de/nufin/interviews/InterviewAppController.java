package de.nufin.interviews;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class InterviewAppController {
    @GetMapping("/v1/stocks")
    public List<String> getStocks(@RequestParam(required = false) String stockId) {
        return List.of("Here is a dummy list of stocks: " + stockId);
    }
}
