import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category'
})
export class CategoryPipe implements PipeTransform {

  transform(value: string): string {
    switch(value){
      case 'Front-End': return 'code';
      case 'Back-End': return 'computer';
      case 'back-End': return 'computer';
      case 'back-end': return 'computer';
    }
    return 'code';
  }
}
