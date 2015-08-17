package by.sjc.bez100percent.service.impl;

import by.sjc.bez100percent.model.Credit;
import by.sjc.bez100percent.model.ModuleType;
import by.sjc.bez100percent.model.ProductType;
import by.sjc.bez100percent.model.User;
import by.sjc.bez100percent.service.FinanceService;
import org.springframework.stereotype.Service;

/**
 * Created by desperado on 14.8.15.
 */
@Service
public class FinanceServiceImpl implements FinanceService {

    @Override
    public Credit createCredit(User user) {
        return null;
    }

    @Override
    public Float getCostByProductType(ProductType productType) {
        return null;
    }

    @Override
    public Float getCostByModuleType(ModuleType moduleType) {
        return null;
    }
}
