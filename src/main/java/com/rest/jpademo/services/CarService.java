package com.rest.jpademo.services;

import com.rest.jpademo.viewmodels.CarCreateViewModel;
import com.rest.jpademo.viewmodels.CarUpdateViewModel;
import com.rest.jpademo.viewmodels.CarViewModel;

import java.util.List;

public interface CarService {
    List<CarViewModel> getAll();
    CarViewModel getById(int id);
    CarViewModel create(CarCreateViewModel viewModel);
    CarViewModel update(int id, CarUpdateViewModel viewModel);
    void deleteById(int id);
}

