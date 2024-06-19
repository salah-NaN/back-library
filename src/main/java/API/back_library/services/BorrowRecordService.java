package API.back_library.services;

import API.back_library.repositories.IBorrowRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowRecordService {

    @Autowired
    IBorrowRecordRepository borrowRecordRepository;
}
