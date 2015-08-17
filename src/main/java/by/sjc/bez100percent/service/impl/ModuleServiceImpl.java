package by.sjc.bez100percent.service.impl;

import by.sjc.bez100percent.model.Module;
import by.sjc.bez100percent.model.ModuleType;
import by.sjc.bez100percent.model.Product;
import by.sjc.bez100percent.repo.ModuleRepository;
import by.sjc.bez100percent.repo.ModuleTypeRepository;
import by.sjc.bez100percent.service.FinanceService;
import by.sjc.bez100percent.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by desperado on 14.8.15.
 */
@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private FinanceService financeService;

    @Autowired
    private ModuleRepository moduleRepository;

    @Autowired
    private ModuleTypeRepository moduleTypeRepository;

    @Override
    public List<Module> fetchModules(Product product) {
        List<Module> result = new LinkedList<>();

        for (ModuleType moduleType : product.getProductType().getModuleTypes()) {
            Module module = moduleRepository.findOneByProductAndModuleType(null, moduleType);

            if (module == null) {
                module = orderModule(moduleType);
            }

            module.setProduct(product);
//            TODO cost formation
//            module.setCost(financeService.getCostByModuleType(moduleType));

            module = moduleRepository.save(module);

            result.add(module);
        }

        return result;
    }

    private Module orderModule(ModuleType moduleType) {
        return null;
    }
}
