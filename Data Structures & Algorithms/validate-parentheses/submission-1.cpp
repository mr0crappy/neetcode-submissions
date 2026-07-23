class Solution {
public:
    bool isValid(string s) {
        std::stack<char> brack;
        for(char ch:s){
            if(!brack.empty() && ch == ')' && brack.top() == '('){
                brack.pop();
            }
            else if(!brack.empty() && ch == '}' && brack.top() == '{'){
                brack.pop();
            }
            else if(!brack.empty() && ch == ']' && brack.top() == '['){
                brack.pop();
            }
            else{
                brack.push(ch);
            }
        }
        if(brack.empty()){
            return true;
        }
        return false;
    }
};
