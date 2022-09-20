package com.example.hrbackend.repository;

import com.example.hrbackend.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface meetingRepository extends JpaRepository<Meeting,Integer> {
    Meeting findMeetingById(Integer id);



    List<Meeting> findAllByCustomerId(Integer customerId);

//    find order by hr id
    List<Meeting> findMeetingByHrId(Integer hrId);


}
