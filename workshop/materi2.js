// // if(true){
// //     console.log("Nilai true");
// // }
// // if (false){
// //     console.log("Nilai false");
// // }

// // if(true){
// //     console.log("Nilai true");
// // }else{
// //     console.log("Nilai false");
// // }

// // if(false){
// //     console.log("Nilai true");
// // }else{
// //     console.log("Nilai false");
// // }

// const nilai1 = 60;
// const nilai2 = 70;
// const nilai3 = "90";

// console.log(nilai1 > nilai2);
// console.log(nilai2 < nilai3);
// console.log(nilai3 == nilai1);
// console.log(nilai3 === nilai2);
// console.log(nilai1 == nilai2);
// console.log(nilai1 <= nilai2);
// console.log(nilai1 >= nilai2);
// console.log(nilai1 != nilai2);
// console.log(!nilai1 == nilai2);
// console.log(nilai1 == !nilai2);


// if(nilai1 > nilai2){
//     console.log("Nilai 1 lebih besar dari nilai 2");
// }
// if (nilai1 < nilai2){
//     console.log("Nilai 1 lebih kecil dari nilai 2");
// }else{
//     console.log("Nilai 2 lebih besar dari nilai 1");
// }

const input1 = parseInt(prompt("Masukkan nilai 1 :"));
const input2 = parseInt(prompt("Masukkan nilai 2 :"));

// if(input1 > input2){
//     console.log("Nilai 1 lebih besar dari nilai 2");
// }else if(input1 < input2){
//     console.log("Nilai 1 lebih kecil dari nilai 2");
// }     

if (input1 == input2){
    console.log("Nilai 1 sama dengan nilai 2");
}else if(input1 < input2){
    console.log("Nilai 1 kurang dari nilai 2");
}else{
    console.log("Nilai inputan 1 lebih besar dari nilai inputan 2");
}