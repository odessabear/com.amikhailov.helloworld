package com.amikhailov.t7.treadsPrograms;


import t6.FileCopyUtils;

/**
 * Задача копирования файла в отдельном потоке
 * 
 * @author nedis
 * @version 1.0
 */
public interface CopyFileTask extends Task {
	/**
	 * Устанавливает алгоритм копирования файлов. созданный в предыдущем задании
	 * 
	 * @param copyUtils алгоритм копирования файлов
	 */
	void setFileCopyUtils(FileCopyUtils copyUtils);
}
