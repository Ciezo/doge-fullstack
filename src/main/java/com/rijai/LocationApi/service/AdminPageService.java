package com.rijai.LocationApi.service;

import com.rijai.LocationApi.model.Admin;
import com.rijai.LocationApi.model.Dog;
import com.rijai.LocationApi.repository.AdminRepository;
import com.rijai.LocationApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminPageService implements IAdminPageService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> findAll() {
        // The AdminPageService will return all the LIST of Admin Credentials
        return (List<Admin>) adminRepository.findAll();
    }

    @Override
    public Admin addAdminCreds(Admin admin) {
        // The AdminPageService will ADD the object into the repository
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdminCreds(Admin admin) {
        // The AdminPageService will UPDATE (SAVE) the object into the repository
        return adminRepository.save(admin);
    }

    @Override
    public Admin getAdminCreds(long id) {
        // The AdminPageService will GET the object specified by its ID (PK).
        // That is if it exists in the database (AdminRepository)
        Optional optional = adminRepository.findById(id);
        if (optional.isEmpty())
            return null;
        else
            return (Admin) optional.get();
    }

    @Override
    public void deleteAdmin(long id) {
        // The AdminPageService will DELETE the object from the database (repository)
        Optional<Admin> admin_toDelete = adminRepository.findById(id);
        if(admin_toDelete.isPresent()) {
            adminRepository.delete(admin_toDelete.get());
            System.out.println("Entry deleted!");
        }
        System.out.println("No entries to delete!");

    }
}
