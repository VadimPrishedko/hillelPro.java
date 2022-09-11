package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.impl.Cacheimpl;

@RestController
@RequestMapping("/api")
public class CacheController {

        private final Cacheimpl service;
    private static Logger loggerResult = LoggerFactory.getLogger("logger.result");

        @Autowired
        public CacheController(Cacheimpl service) {
            this.service = service;
        }

        @PostMapping("/create")
        public void createCache(@RequestParam("name") String cache) {
            loggerResult.info("Endpoint /create  Cache name: " + cache);
            service.cache(cache);
        }

        @GetMapping("/get")
        public void get(@RequestParam String cache, @RequestParam String key) {
            loggerResult.info("Endpoint /get  Cache name: " + cache + " " + key);
            service.get(cache, key);
        }

        @PostMapping("/put")
        public void put(@RequestParam String cache, @RequestParam String key, @RequestParam String str) {
            loggerResult.info("Endpoint /put  Cache name: " + cache + " " + key + " " + str);
            service.put(cache, key, str);
        }

        @DeleteMapping("/clear")
        public void clear() {
            loggerResult.info("Endpoint /clearAll");
            service.clear();
        }

        @DeleteMapping("/clear/{cache}")
        public void clear(@PathVariable("cache") String cache) {
            loggerResult.info("Endpoint /clear  Cache name: " + cache);
            service.clear(cache);
        }

        @GetMapping("/exist")
        public void isExist(@RequestParam("name") String cache) {
            loggerResult.info("Endpoint /exist  Cache name: " + cache);
            service.isCacheExist(cache);
        }
    }
