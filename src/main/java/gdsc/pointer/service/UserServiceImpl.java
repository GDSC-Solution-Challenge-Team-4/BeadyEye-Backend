package gdsc.pointer.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import gdsc.pointer.dao.UserDao;
import gdsc.pointer.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    @Override
    public List<User> getUsers() throws Exception {
        return userDao.getUsers();
    }


//    @Override
//    public ResponseEntity<?> insertUser(User user) throws Exception {
//        Firestore firestore = FirestoreClient.getFirestore();
//        ApiFuture<WriteResult> apiFuture =
//                firestore.collection(COLLECTION_NAME).document(user.getId()).set(user);
//        return new ResponseEntity<>("회원 추가 완료", HttpStatus.OK);
//    }
//
//    @Override
//    public ResponseEntity<?> getUserDetail(String id) throws Exception {
//        Firestore firestore = FirestoreClient.getFirestore();
//        DocumentReference documentReference =
//                firestore.collection(COLLECTION_NAME).document(id);
//        ApiFuture<DocumentSnapshot> apiFuture = documentReference.get();
//        DocumentSnapshot documentSnapshot = apiFuture.get();
//        User user = null;
//        if(documentSnapshot.exists()){
//            user = documentSnapshot.toObject(User.class);
//            return new ResponseEntity<>(user, HttpStatus.OK);
//        }
//        else{
//            return new ResponseEntity<>("존재하지 않는 회원입니다.", HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @Override
//    public ResponseEntity<?> updateUser(String id, User user) throws Exception {
//        Firestore firestore = FirestoreClient.getFirestore();
//        ApiFuture<com.google.cloud.firestore.WriteResult> apiFuture
//                = firestore.collection(COLLECTION_NAME).document(id).set(user);
//        return new ResponseEntity<>("회원 수정 완료", HttpStatus.OK);
//    }
//
//    @Override
//    public ResponseEntity<?> deleteUser(String id) throws Exception {
//        Firestore firestore = FirestoreClient.getFirestore();
//        ApiFuture<WriteResult> apiFuture
//                = firestore.collection(COLLECTION_NAME).document(id).delete();
//        return new ResponseEntity<>("회원 삭제 완료", HttpStatus.OK);
//
//    }
}