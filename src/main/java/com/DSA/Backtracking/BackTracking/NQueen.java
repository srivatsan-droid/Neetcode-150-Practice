package com.DSA.Backtracking.BackTracking;

import java.util.*;

public class NQueen {
    public static List<List<String>> solveNQueen(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                board[i][j] = '.';
            }
        }
        backtrack(0,board,res);
        return res;
    }
    private static void backtrack(int r,char[][] board,List<List<String>> res) {
        if(r == board.length) {
            List<String> copy = new ArrayList<>();
            for(char[] row : board) {
                copy.add(new String(row));
            }
            res.add(copy);
            return;
        }
        for(int c = 0;c < board.length;c++) {
            if(isSafe(r,c,board)) {
                board[r][c] = 'Q';
                backtrack(r + 1,board,res);
                board[r][c] = '.';
            }
        }
    }
    private static boolean isSafe(int r,int c,char[][] board) {
        for(int i = r - 1;i >= 0;i--) {
            if(board[i][c] == 'Q')
                return false;
        }
        for(int i = r - 1,j = c - 1;i >= 0 && j >= 0;i--,j--) {
            if(board[i][j] == 'Q')
                return false;
        }
        for(int i = r - 1,j = c + 1;i >= 0 && j < board.length;i--,j++) {
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueen(n);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
