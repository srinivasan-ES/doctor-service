package com.management.doctorService.repository;

import com.management.doctorService.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<DoctorEntity,Long> {
    DoctorEntity findByPhoneNumber(String phoneNumber);
}
