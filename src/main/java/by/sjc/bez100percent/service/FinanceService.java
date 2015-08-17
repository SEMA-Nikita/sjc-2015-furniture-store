package by.sjc.bez100percent.service;

import by.sjc.bez100percent.model.*;

/**
 * Created by desperado on 14.8.15.
 */
public interface FinanceService {

    Credit createCredit(User user);

    Float getCostByProductType(ProductType productType);

    Float getCostByModuleType(ModuleType moduleType);
}
