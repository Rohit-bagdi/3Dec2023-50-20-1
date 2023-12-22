
/*
1108. Defanging an IP Address
Solved
Easy
Topics
Companies
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
*/





class Solution {
    public String defangIPaddr(String address) {
       return  Arrays.stream(address.split("")).map(i -> i.replace(".", "[.]").toString()).collect(Collectors.joining(""));
    }
}
