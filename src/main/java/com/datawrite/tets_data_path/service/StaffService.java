package com.datawrite.tets_data_path.service;

import com.datawrite.tets_data_path.Constants;
import com.datawrite.tets_data_path.Staff;
import com.datawrite.tets_data_path.repository.StaffRepository;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StaffService {
    StaffRepository staffRepository = new StaffRepository();

     public Staff geEmpByIndex(int index){
            return staffRepository.geEmpByIndex(index);
        } 

        public Staff geEmpById(String id){
            int index = getEmpId(id);
            return index == Constants.NO_MATCH ? new Staff() : geEmpByIndex(index);
        } 

           


        public void addEmp(Staff staff){
            staffRepository.addEmp(staff);;
        }

        public void updateEmp(Staff staff , int index){
            staffRepository.updateEmp(staff, index);
        }

        /**
           Remove Single Employee  start 
         */

         public void removeEmployee(int index){
            staffRepository.removeEmployee(index);
        }

        /**
           Remove Single Employee  end
        */

        public List<Staff> getAllEmp(){
            return staffRepository.getAllEmp();
        }

        public int getEmpId(String id){
        for (int i = 0; i < getAllEmp().size(); i++) {
            if (geEmpByIndex(i).getId().equals(id)) {
                return i;
            }
        }
        return Constants.NO_MATCH;
    }


    public void submitStaff(Staff staff ){
        int index = getEmpId(staff.getId());

        if (index == Constants.NO_MATCH) {
            addEmp(staff);
        }else{
            updateEmp(staff, index);
        }
    }
    
}
