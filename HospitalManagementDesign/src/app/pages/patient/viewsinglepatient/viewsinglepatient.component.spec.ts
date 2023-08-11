import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewsinglepatientComponent } from './viewsinglepatient.component';

describe('ViewsinglepatientComponent', () => {
  let component: ViewsinglepatientComponent;
  let fixture: ComponentFixture<ViewsinglepatientComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewsinglepatientComponent]
    });
    fixture = TestBed.createComponent(ViewsinglepatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
