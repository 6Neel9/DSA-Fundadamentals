let PalChecker=( str , start , end)=>{
    // If there is only one character
    if (start == end)
        return true;

    
    if ((str.charAt(start)) != (str.charAt(end)))
        return false;

    
    if (start < end + 1)
        return PalChecker(str, start + 1, end - 1);

    return true;
}
let str="geeg"
console.log(PalChecker(str,0,str.length-1));